import xmlrpc.client

proxy = xmlrpc.client.ServerProxy("http://13.62.100.45:8000/")

print("Addition:", proxy.add(5, 3))
print("Multiplication:", proxy.multiply(4, 6))
