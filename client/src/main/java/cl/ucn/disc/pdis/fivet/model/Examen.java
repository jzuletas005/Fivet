/*
 * MIT License
 *
 * Copyright (c) 2020 Javier Zuleta Silva <jzuletas005@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cl.ucn.disc.pdis.fivet.model;


import java.util.Date;

public class Examen {

    /**
     *Nombre: nombre del examen. Ej: Radiología
     */
    public final String Nombre;

    /**
     *Fecha: fecha en la que fue tomado el examen. ej: 15/06/2015
     */
    public final Date Fecha;

    /**
     * Constructor
     * @param nombre
     * @param fecha
     */
    public Examen(String nombre, Date fecha) {
        Nombre = nombre;
        Fecha = fecha;
    }

    /**
     *
     * @return the Nombre of Examen
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @return the Fecha of Examen
     */
    public Date getFecha() {
        return Fecha;
    }
}
