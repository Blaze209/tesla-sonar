package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes3.dex */
@in.a
public interface NativeModule {
    default boolean canOverrideExistingModule() {
        return false;
    }

    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = true, since = "Use invalidate method instead")
    default void onCatalystInstanceDestroy() {
    }
}
