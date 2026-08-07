package com.tesla.command_utils.usecase;

import androidx.annotation.Keep;
import kotlinx.coroutines.DebugKt;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tesla/command_utils/usecase/CommandSigningRequirement;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OFF", "ALLOWED", "REQUIRED", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum CommandSigningRequirement {
    OFF(DebugKt.DEBUG_PROPERTY_VALUE_OFF),
    ALLOWED("allowed"),
    REQUIRED("required");

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final String value;

    CommandSigningRequirement(String str) {
        this.value = str;
    }

    public static EnumEntries<CommandSigningRequirement> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
