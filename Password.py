def check_password(correctpassword):

	for index in range(3):
		user_password = (int(input('Enter security pin (4 digit pin)')))

		if user_password == correctpassword:
			print('Access Granted')	
			break
		else:
			print('Try again')
			

	
check_password(1234)


