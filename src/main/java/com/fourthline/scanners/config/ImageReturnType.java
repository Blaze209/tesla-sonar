package com.fourthline.scanners.config;

import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/scanners/config/ImageReturnType;", "", "jsonName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsonName", "()Ljava/lang/String;", "BASE_64", "FILE_URL", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ImageReturnType {
    BASE_64("base64"),
    FILE_URL("fileUrl");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final String jsonName;

    ImageReturnType(String str) {
        this.jsonName = str;
    }

    public static EnumEntries<ImageReturnType> getEntries() {
        return $ENTRIES;
    }

    public final String getJsonName() {
        return this.jsonName;
    }
}
