import logging

logging.basicConfig(level=logging.INFO,filename='app.log',
format='%(name)s - %(levelname)s - %(message)s')

def checkDups(nums):
    dups=set()
    if len(nums)==0:
        logging.error("Array is empty!")
        return "Array is empty"

    elif len(nums)==len(set(nums)):
        logging.info("No duplicates")
        return "No duplicates"

    else:
        for i in range(len(nums)):
            j=i+1
            for j in range(j,len(nums)):
                if nums[i]==nums[j]:
                    dups.add(nums[i])
                    break
        logging.info("Success")
        return dups

numArray=[4,3,8,8,35,35,12]
print(checkDups(numArray))
