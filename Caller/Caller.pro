#-------------------------------------------------
#
# Project created by QtCreator 2012-08-18T17:26:05
#
#-------------------------------------------------

QT       += core

QT       -= gui

TARGET = Caller
CONFIG   += console
CONFIG   -= app_bundle

TEMPLATE = app


SOURCES += main.cpp

unix:!symbian|win32: LIBS += -L$$OUT_PWD/../ClsLib/ -lClsLib

INCLUDEPATH += $$PWD/../ClsLib
DEPENDPATH += $$PWD/../ClsLib
