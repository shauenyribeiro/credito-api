/*
 * MIT License
 *
 * Copyright (c) 2020 Elias Nogueira
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

package com.eliasnogueira.credit.service.impl;

import com.eliasnogueira.credit.entity.Restricao;
import com.eliasnogueira.credit.repository.RestricaoRepository;
import com.eliasnogueira.credit.service.RestricaoService;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service("restricaoService")
public class RestricaoServiceImpl implements RestricaoService {

    private final RestricaoRepository repository;

    public RestricaoServiceImpl(RestricaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Restricao save(Restricao restricao) {
        return null;
    }

    public Optional<Restricao> findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }
}