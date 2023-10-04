# Christopher Mangan COMP 126
foodPrice = float(input( "Enter food price" ))
TIP_RATE = .2
TAX_RATE = .07
tax = foodPrice * TAX_RATE
taxedFoodPrice = foodPrice + tax
tip = taxedFoodPrice * TIP_RATE
tippedFoodPrice = taxedFoodPrice + tip
    
    
print( "Initial Food Price: ", foodPrice )
print( "Your tax: ", tax )
print( "Your taxed food price: ", taxedFoodPrice )
print( "Your tip: ", tip )
print( "Your tipped (total) food price: ", tippedFoodPrice )
