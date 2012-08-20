QT       -= core gui

TARGET = ClsLib
TEMPLATE = lib

DEFINES += CLSLIB_LIBRARY

SOURCES += clslib.cpp \
    clsimpl.cpp

HEADERS += clslib.h\
        ClsLib_global.h \
    clsimpl.h

unix:!symbian {
    maemo5 {
        target.path = /opt/usr/lib
    } else {
        target.path = /usr/lib
    }
    INSTALLS += target
}
