# Vi File Edit

#### Edit by opening:

- vi log4j2.xml
- press i
- edit file
- press Esc to switch to normal mode
- press `:` then command `wq` to save and exit



#### Edit without opening file:

```
vi -c "%s/INFO/DEBUG/g|wq" log4j2.xml
```

