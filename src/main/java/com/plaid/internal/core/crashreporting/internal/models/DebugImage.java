package com.plaid.internal.core.crashreporting.internal.models;

import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/DebugImage;", "Ljava/io/Serializable;", "uuid", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getUuid", "toString", "Companion", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebugImage implements Serializable {
    private static final String DEFAULT_TYPE = "proguard";
    private final String type;
    private final String uuid;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DebugImage(String uuid) {
        this(uuid, null, 2, 0 == true ? 1 : 0);
        s.k(uuid, "uuid");
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public String toString() {
        return "DebugImage{uuid='" + this.uuid + "', type='" + this.type + "'}";
    }

    public DebugImage(String uuid, String type) {
        s.k(uuid, "uuid");
        s.k(type, "type");
        this.uuid = uuid;
        this.type = type;
    }

    public /* synthetic */ DebugImage(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "proguard" : str2);
    }
}
