package ue;

import java.util.Arrays;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2.\u0010\u0011\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u000f\"\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lue/g;", "Lue/c;", "Lue/e;", "dateGenerator", "Lue/i;", "jweEncryptor", "<init>", "(Lue/e;Lue/i;)V", "", "fieldKeyToEncrypt", "", "fieldValueToEncrypt", "publicKey", "a", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "", "Lkotlin/Pair;", "fieldsToEncrypt", "b", "(Ljava/lang/String;[Lkotlin/Pair;)Ljava/lang/String;", "Lue/e;", "Lue/i;", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dateGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i jweEncryptor;

    public g(e dateGenerator, i jweEncryptor) {
        s.k(dateGenerator, "dateGenerator");
        s.k(jweEncryptor, "jweEncryptor");
        this.dateGenerator = dateGenerator;
        this.jweEncryptor = jweEncryptor;
    }

    @Override // ue.c
    public String a(String fieldKeyToEncrypt, Object fieldValueToEncrypt, String publicKey) {
        s.k(fieldKeyToEncrypt, "fieldKeyToEncrypt");
        s.k(publicKey, "publicKey");
        return b(publicKey, x.a(fieldKeyToEncrypt, fieldValueToEncrypt));
    }

    public String b(String publicKey, Pair<String, ? extends Object>... fieldsToEncrypt) {
        s.k(publicKey, "publicKey");
        s.k(fieldsToEncrypt, "fieldsToEncrypt");
        return this.jweEncryptor.a(publicKey, h.f116164a.a(this.dateGenerator.a(), v0.m((Pair[]) Arrays.copyOf(fieldsToEncrypt, fieldsToEncrypt.length))));
    }
}
