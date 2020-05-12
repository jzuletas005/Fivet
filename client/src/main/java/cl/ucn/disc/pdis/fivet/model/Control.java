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

public class Control {

    /**
     *Fecha: fecha del control.
     */
    public final Date Fecha;

    /**
     *Fecha próximo control: fecha del próximo control.
     */
    public final Date ProxFecha;

    /**
     * Temperatura: del paciente en grados celsius.
     */
    public final Integer Temperatura;

    /**
     * Peso: del paciente expresado en kilos.
     */
    public final Integer Peso;

    /**
     * Altura: del paciente expresado en cm.
     */
    public final Integer Altura;

    /**
     * Diagnóstico: Descripción textual del control realizado
     */
    public final String Diagnostico;

    /**
     * Veterinario: Nombre del veterinario que realizó el control.
     */
    public final String Veterinario;

    /**
     * Constructor
     * @param fecha
     * @param proxFecha
     * @param temperatura
     * @param peso
     * @param altura
     * @param diagnostico
     * @param veterinario
     */
    public Control(Date fecha, Date proxFecha, Integer temperatura, Integer peso, Integer altura, String diagnostico, String veterinario) {
        Fecha = fecha;
        ProxFecha = proxFecha;
        Temperatura = temperatura;
        Peso = peso;
        Altura = altura;
        Diagnostico = diagnostico;
        Veterinario = veterinario;
    }

    /**
     *
     * @return The Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     *
     * @return The Proxima Fecha
     */
    public Date getProxFecha() {
        return ProxFecha;
    }

    /**
     *
     * @return The Temperatura
     */
    public Integer getTemperatura() {
        return Temperatura;
    }

    /**
     *
     * @return The Peso
     */
    public Integer getPeso() {
        return Peso;
    }

    /**
     *
     * @return The Altura
     */
    public Integer getAltura() {
        return Altura;
    }

    /**
     *
     * @return The Diagnostico
     */
    public String getDiagnostico() {
        return Diagnostico;
    }

    /**
     *
     * @return The Veterinario
     */
    public String getVeterinario() {
        return Veterinario;
    }
}
