# Shell Scripting

***1***.

​	**a)** 

```shell
$ vi -c "%s/\"//g" cdr_dosyasi.txt > cdr_dosyasi.txt
```

​	**b)**

```shell
$ awk -F"," 'NR!=1{print $1,$2,$3,"90"$4}' OFS="," cdr_dosyasi.txt > output.txt
```

​	**c)** 

```shell
$ dos2unix output.txt
$ awk -F"," 'NR!=1{print $1,$2,$3,"90"$4,$3-$2}' OFS="," output.txt > result.txt
```

***2.***

​	**a)** 

```shell
$ grep -i '"0","0","0","0","0","0","0","0","0","0","0","0"' psmkota20170526091500.txt>psmkota20170526091500.txt.filter
```

​	**b)** 

```shell
$ grep -v '"0","0","0","0","0","0","0","0","0","0","0","0"' psmkota20170526091500.txt>psmkota20170526091500.txt.dat
```

***3.***

```shell
$ mkdir oktaypolat

$ cd oktaypolat

$ mkdir bin

$ PATH=$PATH:/oktaypolat/bin
```

***4.***

```shell
$ awk '$0 ~/FileId/{split($0,a,","); printf"insert into AGGREGATION_STATUS values"; for(i=1; i<=5; i++){{split(a[i],b,"="); if(i==1){printf"(%s",b[2];}else printf", %s",b[2];}}printf");\n"} END{print"commit;"}' rlh.err.txt > sql.txt
```

***5.***

```shell
#!/bin/bash
backup_files=/BSCS_LOG
dest=BSCS_WORK/BACKUP_LOGS

day=$(date +%x)
archive_file="bscs_log_$day.tar.gz"

tar czf $dest/$archive_file $backup_files
```

```shell
$ crontab -e

Choose [1-3]: 1 --> in order to edit with nano

29 0 * * * /bin/bash /path/backup_script.sh -->run script every day at 12:30 am
```

***6.***

```shell
$ pgrep -x rih >/dev/null && echo "Rih is running" || echo "Rih is not running"
$ pgrep -x prih >/dev/null && echo "Prih is running" || echo "Prih is not running"
```

***7.***

```shell
$ vi "%s/^M//g"  filename
```

***8.***

```shell
$ dos2unix sample_udr.txt
$ sed '/./{H;$!d};x;/905552171251/!d' sample_udr.txt > 905552171251.udr 
```