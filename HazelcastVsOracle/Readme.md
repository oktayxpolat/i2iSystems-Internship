This project compares Hazelcast data put/get and Oracle insert/select.

And this is the results.(Results may vary)

|                   | 20.000           | 100.000           |
| ----------------- | ---------------- | ----------------- |
| **Hazelcast Put** | 9.4475263(sec)   | 39.0832444(sec)   |
| **Hazelcast Get** | 4.4563639(sec)   | 15.7958622(sec)   |
| **Oracle Insert** | 221.5650039(sec) | 1131.1992617(sec) |
| **Oracle Select** | 41.1559687(sec)  | 196.5427914(sec)  |

