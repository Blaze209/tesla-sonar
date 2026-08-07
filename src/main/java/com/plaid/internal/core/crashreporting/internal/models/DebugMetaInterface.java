package com.plaid.internal.core.crashreporting.internal.models;

import ax.c;
import java.util.ArrayList;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/DebugMetaInterface;", "", "()V", "debugImages", "Ljava/util/ArrayList;", "Lcom/plaid/internal/core/crashreporting/internal/models/DebugImage;", "getDebugImages", "()Ljava/util/ArrayList;", "hashCode", "", "toString", "", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebugMetaInterface {

    @c("images")
    private final ArrayList<DebugImage> debugImages = new ArrayList<>();

    public final ArrayList<DebugImage> getDebugImages() {
        return this.debugImages;
    }

    public int hashCode() {
        return this.debugImages.hashCode();
    }

    public String toString() {
        return "DebugMetaInterface{debugImages=" + this.debugImages + "}";
    }
}
