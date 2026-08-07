package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class d {
    private static void a(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws Throwable {
        Throwable th2;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = fileInputStream.getChannel();
            try {
                channel = fileOutputStream.getChannel();
                try {
                    channel2.transferTo(0L, channel2.size(), channel);
                    try {
                        channel2.close();
                    } finally {
                        if (channel != null) {
                            channel.close();
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    fileChannel = channel2;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } finally {
                            if (channel != null) {
                                channel.close();
                            }
                        }
                    }
                    if (channel == null) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                channel = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            channel = null;
        }
    }

    private static ArrayList<File> b(Context context) {
        ArrayList<File> arrayList = new ArrayList<>();
        try {
            File[] fileArrListFiles = context.getDatabasePath("noop").getParentFile().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.getName().startsWith("RKStorage-scoped-experience-") && !file.getName().endsWith("-journal")) {
                        arrayList.add(file);
                    }
                }
            }
            return arrayList;
        } catch (Exception e11) {
            e11.printStackTrace();
            return arrayList;
        }
    }

    private static File c(ArrayList<File> arrayList) {
        File file = null;
        if (arrayList.size() == 0) {
            return null;
        }
        long j11 = -1;
        for (File file2 : arrayList) {
            long jE = e(file2);
            if (jE > j11) {
                file = file2;
                j11 = jE;
            }
        }
        return file != null ? file : arrayList.get(0);
    }

    private static long d(File file) {
        try {
            return Files.readAttributes(file.toPath(), c.a(), new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static long e(File file) {
        try {
            return Build.VERSION.SDK_INT >= 26 ? d(file) : file.lastModified();
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1L;
        }
    }

    private static boolean f(Context context) {
        return context.getDatabasePath("RKStorage").exists();
    }

    public static void g(Context context) throws Throwable {
        if (f(context)) {
            return;
        }
        ArrayList<File> arrayListB = b(context);
        File fileC = c(arrayListB);
        if (fileC == null) {
            Log.v("AsyncStorageExpoMigration", "No scoped database found");
            return;
        }
        try {
            g.B(context).t();
            a(new FileInputStream(fileC), new FileOutputStream(context.getDatabasePath("RKStorage")));
            Log.v("AsyncStorageExpoMigration", "Migrated most recently modified database " + fileC.getName() + " to RKStorage");
            try {
                for (File file : arrayListB) {
                    if (file.delete()) {
                        Log.v("AsyncStorageExpoMigration", "Deleted scoped database " + file.getName());
                    } else {
                        Log.v("AsyncStorageExpoMigration", "Failed to delete scoped database " + file.getName());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Log.v("AsyncStorageExpoMigration", "Completed the scoped AsyncStorage migration");
        } catch (Exception e12) {
            Log.v("AsyncStorageExpoMigration", "Failed to migrate scoped database " + fileC.getName());
            e12.printStackTrace();
        }
    }
}
