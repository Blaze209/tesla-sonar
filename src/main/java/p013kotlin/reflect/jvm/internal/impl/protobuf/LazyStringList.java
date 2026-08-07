package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    ByteString getByteString(int i11);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();
}
