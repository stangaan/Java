public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    $re = '/"[\w,":]+(?= false| true)/m';
    $str = '
            "indexpatterns": [
            "couriersalary.syntheticaddress-*"
            ],
            "version": 69,
            "settings": {
        "index": {
            "mapping": {
                "coerce": false,
                        "ignoremalformed": true,
                        "totalfields.limit": 100
            },
            "codec": "bestcompression",
                    "numberofshards": 6
        },
        "analysis": {
            "normalizer": {
                "lowercasenormalizer": {
                    "type": "custom",
                            "charfilter": [],
                    "filter": [
                    "lowercase",
                            "asciifolding"
          ]
                }
            }
        }
    },';

    preg_match_all($re, $str, $matches, PREG_SET_ORDER, 0);

    // Print the entire match result
    var_dump($matches);

}