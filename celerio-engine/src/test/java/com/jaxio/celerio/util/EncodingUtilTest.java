/*
 * Copyright 2015 JAXIO http://www.jaxio.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jaxio.celerio.util;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class EncodingUtilTest {
    @Test
    public void isoEncoding() throws UnsupportedEncodingException {
        // assertThat(fixIso(null)).isNull();
        // assertThat(fixIso("")).isEqualTo("");
        // assertThat(fixIso("NÂ°Client")).isEqualTo("N°Client");
        // assertThat(fixIso("N°Client")).isEqualTo("N°Client");
        // assertThat(fixIso("#TÃ©lÃ©phone")).isEqualTo("#Téléphone");
        // assertThat(fixIso("#Téléphone")).isEqualTo("#Téléphone");
        // assertThat(fixIso("# Courrier Ã©lectronique")).isEqualTo("# Courrier électronique");
    }
}
