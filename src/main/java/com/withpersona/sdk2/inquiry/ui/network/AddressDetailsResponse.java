package com.withpersona.sdk2.inquiry.ui.network;

import com.squareup.moshi.i;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@p013kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressDetailsResponse;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "attributes", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "()Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddressDetailsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LocationData attributes;

    public AddressDetailsResponse(LocationData attributes) {
        s.k(attributes, "attributes");
        this.attributes = attributes;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocationData getAttributes() {
        return this.attributes;
    }
}
