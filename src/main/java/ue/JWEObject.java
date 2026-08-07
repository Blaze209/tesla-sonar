package ue;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ue.j, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001b"}, d2 = {"Lue/j;", "", "Lue/a;", "header", "encryptedKey", "initializationVector", "cipherText", "authTag", "<init>", "(Lue/a;Lue/a;Lue/a;Lue/a;Lue/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lue/a;", DateTokenConverter.CONVERTER_KEY, "()Lue/a;", "b", "c", "e", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class JWEObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a encryptedKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a initializationVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a cipherText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a authTag;

    public JWEObject(a header, a encryptedKey, a initializationVector, a cipherText, a authTag) {
        s.k(header, "header");
        s.k(encryptedKey, "encryptedKey");
        s.k(initializationVector, "initializationVector");
        s.k(cipherText, "cipherText");
        s.k(authTag, "authTag");
        this.header = header;
        this.encryptedKey = encryptedKey;
        this.initializationVector = initializationVector;
        this.cipherText = cipherText;
        this.authTag = authTag;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAuthTag() {
        return this.authTag;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getCipherText() {
        return this.cipherText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getEncryptedKey() {
        return this.encryptedKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getInitializationVector() {
        return this.initializationVector;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JWEObject)) {
            return false;
        }
        JWEObject jWEObject = (JWEObject) other;
        return s.f(this.header, jWEObject.header) && s.f(this.encryptedKey, jWEObject.encryptedKey) && s.f(this.initializationVector, jWEObject.initializationVector) && s.f(this.cipherText, jWEObject.cipherText) && s.f(this.authTag, jWEObject.authTag);
    }

    public int hashCode() {
        return (((((((this.header.hashCode() * 31) + this.encryptedKey.hashCode()) * 31) + this.initializationVector.hashCode()) * 31) + this.cipherText.hashCode()) * 31) + this.authTag.hashCode();
    }

    public String toString() {
        return "JWEObject(header=" + this.header + ", encryptedKey=" + this.encryptedKey + ", initializationVector=" + this.initializationVector + ", cipherText=" + this.cipherText + ", authTag=" + this.authTag + ")";
    }
}
