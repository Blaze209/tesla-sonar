package com.fourthline.scanners.config.orca.kyc.model.serialization;

import java.net.URI;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import to0.e;
import to0.f;
import to0.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/serialization/UriSerializer;", "Lro0/d;", "Ljava/net/URI;", "<init>", "()V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/net/URI;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Ljava/net/URI;)V", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UriSerializer implements d<URI> {
    public static final UriSerializer INSTANCE = new UriSerializer();
    private static final f descriptor = m.c("URI", e.i.f114883a);

    private UriSerializer() {
    }

    @Override // ro0.d, ro0.q, ro0.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.c
    public URI deserialize(uo0.e decoder) {
        s.k(decoder, "decoder");
        URI uriCreate = URI.create(decoder.r());
        s.j(uriCreate, "create(...)");
        return uriCreate;
    }

    @Override // ro0.q
    public void serialize(uo0.f encoder, URI value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        String string = value.toString();
        s.j(string, "toString(...)");
        encoder.q(string);
    }
}
