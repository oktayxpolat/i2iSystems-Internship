import zeep
import logging

#logging.basicConfig(level=logging.DEBUG,filename='app.log', filemode='w', format='%(name)s - %(levelname)s - %(message)s')
wsdl = 'http://www.dneonline.com/calculator.asmx?wsdl'
client = zeep.Client(wsdl=wsdl)
#logging.debug('This will get logged to a file')
operation=input("Operation: ")
if operation=="add":
    print(client.service.Add(15, 20))
elif operation=="subtract":
    print(client.service.Subtract(15, 20))
elif operation=="multiply":
    print(client.service.Multiply(15, 20))
elif operation=="divide":
    print(client.service.Divide(15, 20))
else:
    print("Invalid Inputé")
