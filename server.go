package main

import (
	"fmt"
	"log"
	"net/http"
	"strconv"

	"github.com/gorilla/mux"
)

func main() {
	router := mux.NewRouter().StrictSlash(true)
	router.HandleFunc("/doSum/{x}/{y}", doSum).Methods("GET")
	router.HandleFunc("/doMultiply/{x}/{y}", doMultiply).Methods("GET")

	log.Fatal(http.ListenAndServe(":8081", router))
}

func doSum(w http.ResponseWriter, r *http.Request) {
	vars := mux.Vars(r)
	x, _ := strconv.ParseFloat(vars["x"], 32)
	y, _ := strconv.ParseFloat(vars["y"], 32)

	w.WriteHeader(http.StatusOK)
	fmt.Fprintln(w, "Result:", x+y)
}

func doMultiply(w http.ResponseWriter, r *http.Request) {
	vars := mux.Vars(r)
	x, _ := strconv.ParseFloat(vars["x"], 32)
	y, _ := strconv.ParseFloat(vars["y"], 32)

	w.WriteHeader(http.StatusOK)
	fmt.Fprintln(w, "Result:", x*y)
}
