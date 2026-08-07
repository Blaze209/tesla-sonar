package j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.stream.Stream$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Stream$EL {
    public static List toList(Stream stream) {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(stream.toArray())));
    }
}
