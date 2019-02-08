package com.sk.springapp.service;

import java.util.List;

/**
 * @author Sergey Kuzhel
 */
public interface FileService {

    List<String> read();

    void write();
}
