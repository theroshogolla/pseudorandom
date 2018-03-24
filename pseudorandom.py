import time

def lcg(k, c, m, seed):
	i = 0
	while i < 100:
		print (seed)
		seed = (k * seed + c) % m
		i = i + 1
		time.sleep(0.5)

lcg(7, 11, 18, 1)

		