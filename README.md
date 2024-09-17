# MusicPlayerActivity - Proyecto de Reproductor de Música en Android

## Autor: Luigui Alexander Huanca Capira
- **Fecha de creación**: 2024-09-15
- **Fecha última modificación**: 2024-09-15

## Descripción
Este proyecto es una aplicación de Android que permite al usuario seleccionar y reproducir diferentes archivos de audio desde un `Spinner`. La aplicación tiene las funcionalidades de reproducción y detención del audio seleccionado, utilizando la clase `MediaPlayer` de Android para gestionar la reproducción.

### Funcionalidades principales:
- **Selección de audio**: Los usuarios pueden seleccionar un archivo de audio desde una lista desplegable (`Spinner`).
- **Reproducción de audio**: Un botón "Play" permite iniciar la reproducción del archivo seleccionado.
- **Detención de audio**: Un botón "Stop" permite detener el audio que se está reproduciendo.
- **Visualización de información del audio**: Un `ImageView` muestra un ícono con información relacionada al audio.

## Estructura de Archivos

### `MusicPlayerActivity.kt`
El archivo principal de la actividad. Contiene la lógica para gestionar el `Spinner` de selección de audios y los botones de "Play" y "Stop". Utiliza `MediaPlayer` para la reproducción de archivos de audio.

### `ExampleInstrumentedTest.kt`
Este archivo contiene pruebas instrumentadas para verificar que el contexto de la aplicación se cargue correctamente en un dispositivo Android.

### `ExampleUnitTest.kt`
Este archivo contiene pruebas unitarias para verificar funcionalidades básicas, como operaciones aritméticas simples.

### `activity_music_player.xml`
Archivo de diseño XML que describe la interfaz de usuario. Contiene un `Spinner` para seleccionar audios, dos botones para controlar la reproducción del audio, y un `ImageView` para mostrar información del archivo de audio.

## Instalación
1. Clonar o descargar este repositorio en tu entorno local.
2. Abrir el proyecto en Android Studio.
3. Ejecutar la aplicación en un emulador de Android o en un dispositivo físico.
4. Asegurarse de que los archivos de audio (`audio1`, `audio2`, etc.) estén correctamente almacenados en la carpeta `res/raw`.

## Uso
1. Abrir la aplicación en tu dispositivo Android.
2. Seleccionar un archivo de audio de la lista desplegable.
3. Hacer clic en el botón "Play" para iniciar la reproducción.
4. Hacer clic en el botón "Stop" para detener la reproducción del audio.

## Notas
- Los archivos de audio deben ser almacenados en la carpeta `res/raw` con nombres que coincidan con los que se especifican en el código.
- La aplicación puede ser ampliada para incluir más funcionalidades, como la posibilidad de pausar y reanudar la reproducción, o agregar más detalles en la interfaz de usuario.

## Requerimientos
- Android Studio 4.0 o superior.
- SDK de Android versión mínima 21 (Lollipop).
- Dispositivo o emulador con Android 5.0 o superior.

## Créditos
- Icono de información de audio utilizado en la interfaz: `ic_audio_info`, que puede ser personalizado o sustituido con otro ícono gráfico.

## Licencia
Este proyecto está licenciado bajo la licencia MIT. Puedes ver más detalles en el archivo LICENSE.
