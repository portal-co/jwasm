package io.github.eutro.jwasm2java;

import java.util.ArrayList;
import java.util.List;

public class Externs {
    public List<FuncExtern> funcs = new ArrayList<>();
    public List<TypedExtern> tables = new ArrayList<>();
    public List<Extern> mems = new ArrayList<>();
    public List<TypedExtern> globals = new ArrayList<>();
}
