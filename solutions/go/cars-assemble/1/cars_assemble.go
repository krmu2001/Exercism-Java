package cars

// CalculateWorkingCarsPerHour calculates how many working cars are
// produced by the assembly line every hour.
func CalculateWorkingCarsPerHour(productionRate int, successRate float64) float64 {
	var workingCarsPerHour float64 = (float64(productionRate) * successRate) / 100
	return workingCarsPerHour
}

// CalculateWorkingCarsPerMinute calculates how many working cars are
// produced by the assembly line every minute.
func CalculateWorkingCarsPerMinute(productionRate int, successRate float64) int {
	var workingCarsPerMinute = int(((float64(productionRate) * successRate) / 100) / 60)
	return workingCarsPerMinute
}

// CalculateCost works out the cost of producing the given number of cars.
func CalculateCost(carsCount int) uint {
	var cost uint = 0
	var divByTen bool = false
	if carsCount%10 == 0 {
		divByTen = true
	}
	if divByTen {
		cost = uint((carsCount / 10) * 95000)
	} else if divByTen == false {
		cost = uint(((carsCount / 10) * 95000) + carsCount%10*10000)
	}

	return cost
}
