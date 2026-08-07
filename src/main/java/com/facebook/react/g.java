package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(since = "This class is deprecated, please use BaseReactPackage instead.")
public abstract class g implements p0 {
    abstract Iterable<ModuleHolder> a(ReactApplicationContext reactApplicationContext);

    protected abstract List<ModuleSpec> b(ReactApplicationContext reactApplicationContext);

    public abstract yn.a c();
}
