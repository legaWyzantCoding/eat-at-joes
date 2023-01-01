package com.example.eatatjoes

import javafx.event.ActionEvent
import javafx.scene.control.Label
import javafx.scene.control.Spinner
import java.io.File

class EatAtJoesController {

    lateinit var lblTotalPrice: Label
    lateinit var lblExtendedPrice1: Label
    lateinit var lblUnitPrice1: Label
    lateinit var spinQty1: Spinner<Any>

    lateinit var lblExtendedPrice2: Label
    lateinit var lblUnitPrice2: Label
    lateinit var spinQty2: Spinner<Any>

    lateinit var lblExtendedPrice3: Label
    lateinit var lblUnitPrice3: Label
    lateinit var spinQty3: Spinner<Any>

    lateinit var lblExtendedPrice4: Label
    lateinit var lblUnitPrice4: Label
    lateinit var spinQty4: Spinner<Any>

    fun onMouseClicked() {
        // convert the spinner value to Int
        val qty1 = spinQty1.value.toString().toInt()
        val qty2 = spinQty2.value.toString().toInt()
        val qty3 = spinQty3.value.toString().toInt()
        val qty4 = spinQty4.value.toString().toInt()

        // drop the leading dollar sign from the price
        // and convert it to a double
        val unitPrice1 = lblUnitPrice1.text.drop(1).toDouble()
        val unitPrice2 = lblUnitPrice2.text.drop(1).toDouble()
        val unitPrice3 = lblUnitPrice3.text.drop(1).toDouble()
        val unitPrice4 = lblUnitPrice4.text.drop(1).toDouble()


        // calculate the extended price
        val extendedPrice1 = qty1 * unitPrice1
        val extendedPrice2 = qty2 * unitPrice2
        val extendedPrice3 = qty3 * unitPrice3
        val extendedPrice4 = qty4 * unitPrice4

        // show the extended price formatted as currency
        lblExtendedPrice1.text = "$%.2f".format(extendedPrice1)
        lblExtendedPrice2.text = "$%.2f".format(extendedPrice2)
        lblExtendedPrice3.text = "$%.2f".format(extendedPrice3)
        lblExtendedPrice4.text = "$%.2f".format(extendedPrice4)

        // calculate the total
        calcOrderTotal()
    }

    // calculate the total
    private fun calcOrderTotal() {
        val extPrice1 = lblExtendedPrice1.text.drop(1).toDouble()
        val extPrice2 = lblExtendedPrice2.text.drop(1).toDouble()
        val extPrice3 = lblExtendedPrice3.text.drop(1).toDouble()
        val extPrice4 = lblExtendedPrice4.text.drop(1).toDouble()

        val totalPrice = extPrice1 + extPrice2 + extPrice3 + extPrice4
        lblTotalPrice.text = "$%.2f".format(totalPrice)
    }

    fun btnOrderClicked() {
        val total = lblTotalPrice.text
        File("Orders.txt").appendText("orderTotal=${total}\n")
    }

}
