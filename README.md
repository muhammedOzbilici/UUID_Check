# UUID_Check

Üretilen UUID değerinin formatını kontrol eden metot.<br />

*UUID , 36 karakter unique değerdir. <br />
*5 versiyonu var.<br />
*Version 5 ve Version 3, SHA1 ve MD5 ile hashlenerek oluşturulur.<br />
*En çok kullanılanı Version 1. Bilgisayarınızın MAC adresi ve zaman bilgisi kullanılarak oluşturulur.<br />

Diğer versiyonlar için kullanılacak regex ifadeleri ; <br />

UUID v1 :<br />
`
/^[0-9A-F]{8}-[0-9A-F]{4}-[1][0-9A-F]{3}-[89AB][0-9A-F]{3}-[0-9A-F]{12}$/i`

UUID v2 :<br />
`
/^[0-9A-F]{8}-[0-9A-F]{4}-[2][0-9A-F]{3}-[89AB][0-9A-F]{3}-[0-9A-F]{12}$/i`

UUID v3 :<br />
`
/^[0-9A-F]{8}-[0-9A-F]{4}-[3][0-9A-F]{3}-[89AB][0-9A-F]{3}-[0-9A-F]{12}$/i`

UUID v4 :<br />
`
/^[0-9A-F]{8}-[0-9A-F]{4}-[4][0-9A-F]{3}-[89AB][0-9A-F]{3}-[0-9A-F]{12}$/i`

UUID v5 :<br />
`
/^[0-9A-F]{8}-[0-9A-F]{4}-[5][0-9A-F]{3}-[89AB][0-9A-F]{3}-[0-9A-F]{12}$/i`
<br />


UUID oluşturmak için şu site kullanılabilir ;<br />

https://www.uuidgenerator.net/version4
