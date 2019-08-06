package DS.Stacks;
import DS.Stacks.Stack;
/**
 * Implementation1
 */
public class Implementation1 {

    public static void main(String[] args) {
        
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.pop();
        s1.pop();
        s1.push(30);
        s1.push(20);
        // s1.pop();
        // int k = s1.peek();
        // System.out.println(k);
        
        s1.print();
    }
}

How to find top 5 retaining the indexes?

I tried a method from stack overflow, argpartition, still didn't get correct output. Hre is the output i got. Mumbai 1005 Dispur 272 Jhargam 255 Chennai 232 New Delhi 210 PLease review

TAs are currently not available, the next slot is at 06:00PM today

hi

i'll suggest you to do it like this

first get city and casuality from data

with open(path, 'r',encoding='ISO-8859-1') as data:
    reader = csv.DictReader(data)
    for row in reader:
        if row['Country']=='India':
            city.append(row['City'])
            casualty.append([row['Killed'],row['Wounded']])

like this

now

in casualty and city array

we have casualties and their respective city at same indexes

convert them to numpy

npcasualty=np.array(casualty)
npcity=np.array(city)

convert empty value to zero

npcasualty[npcasualty=='']=0

str to float

npcasualty=np.array(npcasualty,dtype=float)

Now Summing up the Killed and wounded feature to find out the casualty

npcasualty=np.sum(npcasualty,axis=1)

now

i'll make a function

citCasaualtiy

def cityCasualty(cityarr,casualtyarr):
    arr=[]
    
    unique=np.unique(cityarr)
    
    for i in unique:
        
        index,=np.where(cityarr==i)
        
        sumCasualty= casualtyarr[index].sum()
        
        arr.append([sumCasualty,i])
        
    arr.sort(reverse=True)
    return arr

it'll give me a sorted array 

arr=cityCasualty(npcity,npcasualty)

if i'll call it like this

and now i'll find the results

for i in range(6):
    if arr[i][1]!='Unknown':
        print(arr[i][1],int(arr[i][0]))

i'll get this


Srinagar 3134
New Delhi 2095
Mumbai 2016
Jammu 1119
Guwahati 822

as output

I'm marking this resolved. reopen if required :)



TAs are currently not available, the next slot is at 06:00PM today

hi

each row in this dataset is for a attack

as mentioned

It is an open-source database including information on terrorist attacks around the world

it means if a day is mentioned in this dataset then attack was there on that day 

you just need to get all the days from the dataset

then find the unique days and their counts

and print the day with max count

for row in reader:
        day.append(row['Day'])
npday=np.array(day)
unique, counts = np.unique(npday, return_counts=True)
index=counts.argmax()
print(unique[index],counts[index])

like this

I'm marking this resolved. reopen if required :)