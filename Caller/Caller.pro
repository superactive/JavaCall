TARGET = Caller
CONFIG   += console warn_on release

TEMPLATE = app

SOURCES += main.cpp

unix {
  LIBS += -L$$OUT_PWD/../ClsLib/ -lClsLib
}

win32 {
  LIBS += -L$$OUT_PWD/../ClsLib/release/ -lClsLib
}

INCLUDEPATH += $$PWD/../ClsLib
DEPENDPATH += $$PWD/../ClsLib

!exists(main.cpp) {
  error("No main.cpp file found")
}
