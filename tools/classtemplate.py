# Make class template from filename

import os

dir_list = os.listdir(".")

for f in dir_list:
	if ".java" in f:
		with open(f, "w") as classf:
			fname = f[:-5]
			classf.write("public class {} ".format(fname))
			classf.write("{\n")
			classf.write("\n}")
		
