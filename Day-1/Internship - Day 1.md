# Internship - Day 1

In this article, we are installing Docker and pulling Oracle XE. Then we are installing Oracle SQL Developer and connecting to Oracle XE located in Docker.

### Docker Installation(Windows)

Go to https://www.docker.com/get-started and download the Docker Desktop version according to your system. Also you should sign up for Docker Hub to use images.

After installation, allow it to install required packages and restart Windows.

Once it is restarted, it will attempt to run.

If you get an error saying that some package for kernel missing, follow the link under the error and download and execute that package. Then restart Docker and it will start running.

### Oracle XE Installation

Now we have the Docker running and we want to have a container that runs Oracle Express Edition. Firstly look for in in Docker Hub. Hopefully, you will find it but if you can't find the image there is a GitHub repository that you can use: 

https://github.com/wnameless/docker-oracle-xe-11g

In order to install locally, you can follow the instructions in the link. For Docker Hub:

```
docker pull wnameless/oracle-xe-11g-r2
```

Then, you can pass to Quick start chapter. To run it 1521 port opened:

```
docker run -d -p 49161:1521 wnameless/oracle-xe-11g-r2`
```

![Docker and oracle xe](C:\Users\Thinkpad\Desktop\Docker and oracle xe.png)

### Oracle SQL Developer

Go to https://www.oracle.com/tools/downloads/sqldev-downloads.html and download the Oracle SQL Developer version according to your system.

After installation, be sure that your container in Docker is running and click the green plus symbol to add new connection.

Database connection settings are written in the GitHub page(https://github.com/wnameless/docker-oracle-xe-11g). For the article's date, those settings are:

```
hostname: localhost
port: 49161
sid: xe
username: system
password: oracle
```

If you see some errors with add new connection windows and can't see objects:

Go to Tools --> Preferences. Move your cursor over the window. When you see Oracle, click that dropdown and choose Windows. Then there OK and Cancel buttons at the bottom-right corner most probably you can't see. You have to click OK and you are done.

Now you can test your connection with some queries!

![Connection](C:\Users\Thinkpad\Desktop\Connection.png)



