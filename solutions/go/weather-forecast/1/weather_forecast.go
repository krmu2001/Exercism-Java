// Package weather provides current weather
// conditions in various cities in Goblinocus.
package weather

// CurrentCondition represents the current weather conditions.
var CurrentCondition string

// CurrentLocation represents the current weather locations.
var CurrentLocation string

// Forecast returns a string consisting of CurrentCondition and CurrentLocation.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
