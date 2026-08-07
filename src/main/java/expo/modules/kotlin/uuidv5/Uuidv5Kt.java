package expo.modules.kotlin.uuidv5;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\b"}, d2 = {"uuidv5", "Ljava/util/UUID;", "namespace", "name", "", "toBytes", "", "uuid", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Uuidv5Kt {
    public static final byte[] toBytes(UUID uuid) {
        s.k(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        s.j(bArrArray, "array(...)");
        return bArrArray;
    }

    public static final UUID uuidv5(UUID namespace, String name) throws NoSuchAlgorithmException {
        s.k(namespace, "namespace");
        s.k(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(toBytes(namespace));
        byte[] bytes = name.getBytes(d.UTF_8);
        s.j(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[6] = (byte) ((bArrDigest[6] & 15) | 80);
        bArrDigest[8] = (byte) ((bArrDigest[8] & 63) | 128);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrDigest);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }
}
