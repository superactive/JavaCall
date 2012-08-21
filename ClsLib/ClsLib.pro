QT       -= core gui

TARGET = ClsLib
TEMPLATE = lib

DEFINES += CLSLIB_LIBRARY

SOURCES += clslib.cpp

HEADERS += clslib.h

win32: {

}

macx: {

}
unix:!symbian {
    maemo5 {
        target.path = /opt/usr/lib
    } else {
        target.path = /usr/lib
    }
    INSTALLS += target
}

# swig target
swig.commands = swig -c++ -java clslib.i
swig.input = clslib.i
QMAKE_EXTRA_COMPILERS += swig
