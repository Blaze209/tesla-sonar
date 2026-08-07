package com.withpersona.sdk2.inquiry.ui.network;

import com.squareup.moshi.i;
import oi0.n5;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@p013kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\n\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "b", "Meta", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddressAutocompleteRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Meta meta;

    @i(generateAdapter = true)
    @p013kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$Meta;", "", "", "fromComponent", "searchInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Meta {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String fromComponent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String searchInput;

        public Meta(String fromComponent, String searchInput) {
            s.k(fromComponent, "fromComponent");
            s.k(searchInput, "searchInput");
            this.fromComponent = fromComponent;
            this.searchInput = searchInput;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSearchInput() {
            return this.searchInput;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.network.AddressAutocompleteRequest$a, reason: from kotlin metadata */
    @p013kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest$a;", "", "<init>", "()V", "Loi0/n5;", "fromComponent", "", "searchInput", "Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "a", "(Loi0/n5;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/AddressAutocompleteRequest;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AddressAutocompleteRequest a(n5 fromComponent, String searchInput) {
            s.k(fromComponent, "fromComponent");
            s.k(searchInput, "searchInput");
            return new AddressAutocompleteRequest(new Meta(fromComponent.getName(), searchInput));
        }

        private Companion() {
        }
    }

    public AddressAutocompleteRequest(Meta meta) {
        s.k(meta, "meta");
        this.meta = meta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }
}
