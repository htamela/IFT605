"use strict";

let express = require('express');
let app = express();

app.get('/doSum/:x/:y', function(req, res) {
	let x = parseFloat(req.params.x);
	let y = parseFloat(req.params.y);

	res.end(JSON.stringify({ result: x + y}));
});

app.get('/doMultiply/:x/:y', function(req, res) {
	let x = parseFloat(req.params.x);
	let y = parseFloat(req.params.y);

	res.end(JSON.stringify({ result: x * y}));
});

let server = app.listen(8081, function () {
  console.log("REST Server is listening on 8081");
})
