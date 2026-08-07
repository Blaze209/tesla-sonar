package br0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f17975a = Logger.getLogger("org.jmrtd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Short, Byte> f17976b = a();

    private static Map<Short, Byte> a() {
        HashMap map = new HashMap(20);
        map.put((short) 286, (byte) 30);
        map.put((short) 257, (byte) 1);
        map.put((short) 258, (byte) 2);
        map.put((short) 259, (byte) 3);
        map.put((short) 260, (byte) 4);
        map.put((short) 261, (byte) 5);
        map.put((short) 262, (byte) 6);
        map.put((short) 263, (byte) 7);
        map.put((short) 264, (byte) 8);
        map.put((short) 265, (byte) 9);
        map.put((short) 266, (byte) 10);
        map.put((short) 267, (byte) 11);
        map.put((short) 268, (byte) 12);
        map.put((short) 269, (byte) 13);
        map.put((short) 270, (byte) 14);
        map.put((short) 271, (byte) 15);
        map.put((short) 272, Byte.valueOf(Tnaf.POW_2_WIDTH));
        map.put((short) 285, (byte) 29);
        map.put((short) 284, (byte) 28);
        return Collections.unmodifiableMap(map);
    }
}
