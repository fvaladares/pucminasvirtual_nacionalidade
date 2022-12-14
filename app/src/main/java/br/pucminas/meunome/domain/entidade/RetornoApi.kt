/*
 * Created/Adapted by fabricio on 10/08/2022 05:07
 * Last modified 08/08/2022 18:34
 *
 * Copyright (C) 2022 Professor fabricio - PUC Minas Virtual
 *
 * Code based on a example created by Google Developer Training
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */

package br.pucminas.meunome.domain.entidade

import com.squareup.moshi.Json

data class RetornoApi(
    val name: String,
    @Json(name = "country") val country: List<Pais>,
)
