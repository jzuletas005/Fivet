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

public final class Ficha {

    /**
     *Número de ficha: correlativo numérico único asignado automáticamente. ej:
     * 20128
     */
    public final Long NFicha;

    /**
     *Nombre: nombre del paciente, ej: Firulay
     */
    public final String Nombre;

    /**
     *Especie: especie del animal, ej: canino
     */
    public final String Especie;

    /**
     * Fecha de Nacimiento: fecha de nacimiento del animal, puede ser estimada,
     * ej: enero 2014.
     */
    public final String Fecha_Nacimiento;

    /**
     *Raza: del animal, ej: rottweiler.
     */
    public final String Raza;

    /**
     *Sexo: macho, hembra
     */
    public final String Sexo;

    /**
     *Color: rojo cobrizo
     */
    public final String Color;

    /**
     * Tipo de paciente, ej: interno o externo
     */
    public final String Tipo_Paciente;

    /**
     * Constructor
     * @param NFicha
     * @param nombre
     * @param especie
     * @param fecha_Nacimiento
     * @param raza
     * @param sexo
     * @param color
     * @param tipo_Paciente
     */
    public Ficha(Long NFicha, String nombre, String especie, String fecha_Nacimiento, String raza, String sexo, String color, String tipo_Paciente) {
        this.NFicha = NFicha;
        Nombre = nombre;
        Especie = especie;
        Fecha_Nacimiento = fecha_Nacimiento;
        Raza = raza;
        Sexo = sexo;
        Color = color;
        Tipo_Paciente = tipo_Paciente;
    }

    /**
     *
     * @return The NFicha
     */
    public Long getNFicha() {
        return NFicha;
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
     * @return The Especie
     */
    public String getEspecie() {
        return Especie;
    }

    /**
     *
     * @return The Fecha_Nacimiento
     */
    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    /**
     *
     * @return The Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     *
     * @return The Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     *
     * @return The Color
     */
    public String getColor() {
        return Color;
    }

    /**
     *
     * @return The Tipo_Paciente
     */
    public String getTipo_Paciente() {
        return Tipo_Paciente;
    }
}
