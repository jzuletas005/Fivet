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

public final class Dueño {

    /**
     *Nombre: nombre del dueño. ej: Juan
     */
    public final String Nombre;

    /**
     * Dirección: dirección del dueño. ej: Angamos 0610
     */
    public final String Direccion;

    /**
     * Teléfono fijo: número de teléfono fijo. ej: 055 456765
     */
    public final Long FonoFijo;

    /**
     * Teléfono móvil: número de teléfono móvil. ej: 7567328
     */
    public final Long FonoMovil;

    /**
     * Email: dirección de correo electrónico de contacto. ej: contacto@dominio.com
     */
    public final String Email;

    /**
     * RUT: rut del dueño. ej: 12.442.675-1
     */
    public final String RUT;

    /**
     * Constructor
     * @param nombre
     * @param direccion
     * @param fonoFijo
     * @param fonoMovil
     * @param email
     * @param RUT
     */
    public Dueño(String nombre, String direccion, Long fonoFijo, Long fonoMovil, String email, String RUT) {
        Nombre = nombre;
        Direccion = direccion;
        FonoFijo = fonoFijo;
        FonoMovil = fonoMovil;
        Email = email;
        this.RUT = RUT;
    }

    /**
     *
     * @return The Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @return The Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     *
     * @return The FonoFijo
     */
    public Long getFonoFijo() {
        return FonoFijo;
    }

    /**
     *
     * @return The FonoMovil
     */
    public Long getFonoMovil() {
        return FonoMovil;
    }

    /**
     *
     * @return The Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     *
     * @return The RUT
     */
    public String getRUT() {
        return RUT;
    }
}
