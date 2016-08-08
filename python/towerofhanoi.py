n = 3
A = list(range(0,n))
B = []
C = []

def solve(n,initial,final,aux):
	if (n>-1):
	solve(n-1,initial,aux,final)
	print("Move " + n + " from "+ initial+ " to "+final)
	solve(n-1,aux,final,initial)

solve(n,A,B,C)	
