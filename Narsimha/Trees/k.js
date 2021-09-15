let event = {
  name: "Hot Dog and Burger Sunday",
  financials: {
    baseCost: "$19.99",
    discountAvailable: false,
    maxCost: "$29.99",
  },
  subscribers: [],
};

let eventPrice;

// Destructuring that get baseCost property also rename that property by price
const assignEvent = ({ financials: { baseCost: price } }) =>
  (eventPrice = price); // assign price value to the variable eventPrice.

let result = assignEvent(event); // Assigning an object to the function
console.log("result --->", result);
