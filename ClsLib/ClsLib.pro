#-------------------------------------------------
#
# Project created by QtCreator 2012-08-18T17:23:03
#
#-------------------------------------------------

QT       -= core gui

TARGET = ClsLib
TEMPLATE = lib

DEFINES += CLSLIB_LIBRARY

SOURCES += clslib.cpp

HEADERS += clslib.h\
        ClsLib_global.h

symbian {
    MMP_RULES += EXPORTUNFROZEN
    TARGET.UID3 = 0xE334285F
    TARGET.CAPABILITY = 
    TARGET.EPOCALLOWDLLDATA = 1
    addFiles.sources = ClsLib.dll
    addFiles.path = !:/sys/bin
    DEPLOYMENT += addFiles
}

unix:!symbian {
    maemo5 {
        target.path = /opt/usr/lib
    } else {
        target.path = /usr/lib
    }
    INSTALLS += target
}
