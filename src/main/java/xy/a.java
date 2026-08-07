package xy;

/* JADX INFO: loaded from: classes6.dex */
public enum a {
    BLUETOOTH("bluetooth", rf0.c.BluetoothHeadset.class),
    WIRED_HEADSET("headset", rf0.c.WiredHeadset.class),
    SPEAKER("speaker", rf0.c.Speakerphone.class),
    EARPIECE("earpiece", rf0.c.Earpiece.class);

    public final Class<? extends rf0.c> audioDeviceClass;
    public final String typeName;

    a(String str, Class cls) {
        this.typeName = str;
        this.audioDeviceClass = cls;
    }

    public static a fromAudioDevice(rf0.c cVar) {
        for (a aVar : values()) {
            if (aVar.audioDeviceClass.equals(cVar.getClass())) {
                return aVar;
            }
        }
        return null;
    }

    public static a fromTypeName(String str) {
        for (a aVar : values()) {
            if (aVar.typeName.equals(str)) {
                return aVar;
            }
        }
        return null;
    }
}
