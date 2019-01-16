/*
 * The MIT License
 *
 * Copyright 2018 gabrialessi.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ch.ti.cpttrevano.samt.legolib.wait;

import lejos.nxt.Button;

/**
 * Wait the NXT button.
 *
 * @author gabrialessi
 * @author giuliobosco
 * @version 2.0
 */
public class WaitNxtButton extends WaitDigitalSensor {

    // ------------------------------------------------------------------------------------ Costants
    // ---------------------------------------------------------------------------------- Attributes

    /**
     * Button.
     */
    private Button button;

    // --------------------------------------------------------------------------- Getters & Setters

    /**
     * Set the button.
     *
     * @param button Button.
     */
    public void setButton(Button button) {
        if (this.isFinished()) {
            this.button = button;
        }
    }

    /**
     * Get the button.
     *
     * @return Button.
     */
    public Button getButton() {
        return this.button;
    }

    // -------------------------------------------------------------------------------- Constructors

    /**
     * Create the wait NXT button with the comparison wait action and button.
     *
     * @param waitAction Wait action.
     * @param button Button.
     */
    public WaitNxtButton(byte waitAction, Button button) {
        super(waitAction);
        setButton(button);
    }

    // -------------------------------------------------------------------------------- Help Methods

    /**
     * Is the button pressed.
     *
     * @return True if the button is pressed.
     */
    public boolean isPressedButton() {
        return this.getButton().isDown();
    }

    // ----------------------------------------------------------------------------- General Methods
    // --------------------------------------------------------------------------- Static Components
}
